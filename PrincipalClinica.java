public class PrincipalClinica {
    public static void main(String[] args) {

        Persona p1, p2, p3, p4, p5;
        Mascota m1, m2, m3, m4, m5;

        p1 = new Persona("María González", "VET-115");
        p2 = new Persona("Jorge Ramírez", "VET-224");
        p3 = new Persona("Sofía Vargas", "VET-337");
        p4 = new Persona("Daniel Castro", "VET-408");
        p5 = new Persona("Valeria Morales", "VET-519");

        m1 = new Mascota("Toby", "Golden Retriever");
        m2 = new Mascota("Simba", "Gato Persa", 2021);
        m3 = new Mascota("Rocky", "Bulldog Francés", 2019);
        m4 = new Mascota("Mia", "Siamés", 2022);
        m5 = new Mascota("Bruno", "Husky Siberiano", 2017);

        System.out.println("==== ESTADO INICIAL DE LAS PERSONAS ====");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println();

        System.out.println("==== ESTADO INICIAL DE LAS MASCOTAS ====");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println(m4.toString());
        System.out.println(m5.toString());
        System.out.println();

        m1.asignarVeterinario(p1);
        p1.asignarMascota(m1);

        m2.asignarVeterinario(p2);
        p2.asignarMascota(m2);

        m3.asignarVeterinario(p3);
        p3.asignarMascota(m3);

        m4.asignarVeterinario(p4);
        p4.asignarMascota(m4);

        m5.asignarVeterinario(p5);
        p5.asignarMascota(m5);

        System.out.println("==== PERSONA VETERINARIA DE CADA MASCOTA ====");

        System.out.println(
            "Veterinario de " + m1.getNombre() + ": "
            + m1.consultarNombreVeterinario());

        System.out.println(
            "Veterinario de " + m2.getNombre() + ": "
            + m2.consultarNombreVeterinario());

        System.out.println(
            "Veterinario de " + m3.getNombre() + ": "
            + m3.consultarNombreVeterinario());

        System.out.println(
            "Veterinario de " + m4.getNombre() + ": "
            + m4.consultarNombreVeterinario());

        System.out.println(
            "Veterinario de " + m5.getNombre() + ": "
            + m5.consultarNombreVeterinario());

        System.out.println();

        System.out.println("==== MASCOTAS ASIGNADAS A CADA PERSONA ====");

        System.out.println(
            p1.getNombre() + ": "
            + p1.consultarNombreMisMascotas());

        System.out.println(
            p2.getNombre() + ": "
            + p2.consultarNombreMisMascotas());

        System.out.println(
            p3.getNombre() + ": "
            + p3.consultarNombreMisMascotas());

        System.out.println(
            p4.getNombre() + ": "
            + p4.consultarNombreMisMascotas());

        System.out.println(
            p5.getNombre() + ": "
            + p5.consultarNombreMisMascotas());

        System.out.println();

        System.out.println("==== ESTADO FINAL DE LAS MASCOTAS ====");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println(m4.toString());
        System.out.println(m5.toString());
        System.out.println();

        System.out.println("==== ESTADO FINAL DE LAS PERSONAS ====");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
    }
}