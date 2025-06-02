package ParcialesViejos.Segundos.Q2_2024.ej1;

public class TrackerException extends RuntimeException {
  private final IssueType type;

    public TrackerException(IssueType type) {
      this.type = type;
    }

    public String getMessage(){
      return "No issues with type: %s".formatted(type);
    }
}
