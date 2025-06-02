package ParcialesViejos.Primeros.Recuperatorios.Q2_2024.ejercicio2;

public class LibraryTester {
    public static void main(String[] args){
        VideoGameLibrary vgl = new VideoGameLibrary();
// Se agrega un videojuego en formato físico
        vgl.addPhysicalGame("The Last of Us Part II", 2020, "Target");
// Se agrega un videojuego en formato digital
        vgl.addDigitalGame("Among Us", 2018, 0.1);
        vgl.addPhysicalGame("Halo Infinite", 2021, "GameStop");
                vgl.addDigitalGame("Cyberpunk 2077", 2020, 70.0);
                        vgl.addDigitalGame("Stardew Valley", 2016, 0.3);
// Obtiene los videojuegos de la biblioteca (en formato físico y digital) con orden
// ascendente por año de lanzamiento y luego desempata descendente por el nombre
        for (VideoGame game : vgl.getAscendingYearCopy()) {
            System.out.println(game);
        }
// Digital VG Stardew Valley launched in 2016 of size 0.30 GB
// Digital VG Among Us launched in 2018 of size 0.10 GB
// Physical VG The Last of Us Part II launched in 2020 buyed at Target
// Digital VG Cyberpunk 2077 launched in 2020 of size 70.00 GB
// Physical VG Halo Infinite launched in 2021 buyed at GameStop
// Obtiene los videojuegos de la biblioteca (en formato físico y digital) con orden
// descendente por año de lanzamiento y luego desempata alfabético por el nombre
        for (VideoGame game : vgl.getDescendingYearCopy()) {
            System.out.println(game);
        }
// Physical VG Halo Infinite launched in 2021 buyed at GameStop
// Digital VG Cyberpunk 2077 launched in 2020 of size 70.00 GB
// Physical VG The Last of Us Part II launched in 2020 buyed at Target
// Digital VG Among Us launched in 2018 of size 0.10 GB
// Digital VG Stardew Valley launched in 2016 of size 0.30 GB
// Obtiene los videojuegos de la biblioteca (en formato físico y digital) con orden
// de inserción
        for (VideoGame game : vgl) {
            System.out.println(game);
        }
// Physical VG The Last of Us Part II launched in 2020 buyed at Target
// Digital VG Among Us launched in 2018 of size 0.10 GB
// Physical VG Halo Infinite launched in 2021 buyed at GameStop
// Digital VG Cyberpunk 2077 launched in 2020 of size 70.00 GB
// Digital VG Stardew Valley launched in 2016 of size 0.30 GB
    }
}
