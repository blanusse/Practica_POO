package ParcialesViejos.Segundos.Q2_2024.ej1;

import java.time.MonthDay;
import java.util.*;

public class IssueTrackerIt{

    public final Map<IssueType, SortedSet<Issue>> tracker = new HashMap<>();



    public Issue addIssue(String s, MonthDay d, IssueType type) {
        Issue toReturn = new Issue(s, d, type);
        if(!tracker.containsKey(type)){ // todavia no hay issues de este tipo
            tracker.put(type, new TreeSet<>());
        }
        tracker.get(type).add(toReturn); //agrega en el set de la key del tipo la issue
        return toReturn;

    }

    public Collection<Issue> issues() {
        List<Issue> toRet = new ArrayList<>();
        toRet.addAll(tracker.get(IssueType.BUG));
        toRet.addAll(tracker.get(IssueType.ENHANCEMENT));
        toRet.addAll(tracker.get(IssueType.WONTFIX));
        return toRet;
    }

    public Collection<Issue> issues(IssueType type) {
        return tracker.get(type);
    }

    public Issue getOldestIssue(IssueType issueType) {
        if(tracker.get(issueType).isEmpty()){
            throw new TrackerException(issueType);
        }
        return tracker.get(issueType).last();
    }

    public Issue getLatestIssue(IssueType issueType) {
        if(tracker.get(issueType).isEmpty()){
            throw new TrackerException(issueType);
        }
        return tracker.get(issueType).first();
    }

    public boolean removeIssue(Issue issue) {
        if(!tracker.get(issue.getType()).contains(issue)){
            return false;
        }
        tracker.get(issue.getType()).remove(issue);
        return true;
    }
}
