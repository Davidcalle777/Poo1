public class PruebaLibro {
    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
        Libro libro = new Libro();

        // Imprimir los detalles del libro
        System.out.println("ISBN: " + libro.isbn);
        System.out.println("Título: " + libro.titulo);
        System.out.println("Autor: " + libro.autor);
        System.out.println("Número de Páginas: " + libro.numeroDePaginas);

        // crear un objeto de la clase Libro edinson

        Libro libroPorEdinson = new Libro();

        libroPorEdinson.isbn = "900-45-57-11-127";
        libroPorEdinson.titulo = "la poesia insierta";
        libroPorEdinson.autor = "Edinson Mena";
        libroPorEdinson.numeroDePaginas = 520;


        Libro libroPorDavid = new Libro();

        Libro libroPorEsteban = new Libro();

        libroPorEsteban.isbn = "900-11-33-45-115";
        libroPorEsteban.titulo = "Salvaje de corazón";
        libroPorEsteban.autor = "John Eldredge";
        libroPorEsteban.numeroDePaginas = 200;

        System.out.println("ISBN" + libroPorEsteban.isbn);
        System.out.println("Titulo" + libroPorEsteban.titulo);
        System.out.println("Autor" + libroPorEsteban.autor);
        System.out.println("Número de páginas" + libroPorEsteban.numeroDePaginas);


        //Libro por Juan Villa
        Libro libroPorJuan = new Libro();

        libroPorJuan.isbn = "900-11-33-45-111";
        libroPorJuan.titulo = "La etica protestante y el espiritu del capitalismo";
        libroPorJuan.autor = "Max Webber";
        libroPorJuan.numeroDePaginas = 335;

        System.out.println("ISBN: " + libroPorJuan.isbn);
        System.out.println("Titulo :" + libroPorJuan.titulo);
        System.out.println("Autor: " + libroPorJuan.autor);
        System.out.println("Numero de paginas: " + libroPorJuan.numeroDePaginas);

        // miLibrito creado por Miguel
        Libro miLibrito = new Libro();
        miLibrito.isbn = "97-08-11-4785-0";
        miLibrito.titulo = "El señor de las moscas";
        miLibrito.autor = "William Golding";
        miLibrito.numeroDePaginas = 288;

        // Impresion de los detalles del libro miguel
        System.out.println("ISB: " + miLibrito.isbn);
        System.out.println("Titulo: " + miLibrito.titulo);
        System.out.println("Autor: " + miLibrito.autor);
        System.out.println("Numero de Pag: " + miLibrito.numeroDePaginas);

        // Asignar valores a los atributos del libro


        // otro libro kevin
        Libro miLibro2 = new Libro();
        //
        miLibro2.isbn = "87-23-00-2345-8";
        miLibro2.titulo = "El arte de la guerra";
        miLibro2.autor = "sun-tzu";
        miLibro2.numeroDePaginas = 194;
        // impresion
        System.out.println("ISBN:" + miLibro2.isbn);
        System.out.println("Titulo:" + miLibro2.titulo);
        System.out.println("Autor:" + miLibro2.autor);
        System.out.println("Numero de Pag:" + miLibro2.numeroDePaginas);


        // otro libro por Juan Camilo Rios
        Libro libroPorRios = new Libro();
        //
        libroPorRios.isbn = "99-29-09-1999-9";
        libroPorRios.titulo = "Ygdrasill";
        libroPorRios.autor = "Thor";
        libroPorRios.numeroDePaginas = 99092;
        // impresion
        System.out.println("ISBN: " + libroPorRios.isbn);
        System.out.println("Titulo: " + libroPorRios.titulo);
        System.out.println("Autor: " + libroPorRios.autor);
        System.out.println("Numero de Pagina: " + libroPorRios.numeroDePaginas);

        // otro libro creado por santiago
        Libro miLibro3 = new Libro();
        //
        miLibro3.isbn = "77-28-04-2379-9";
        miLibro3.titulo = "Satanás";
        miLibro3.autor = "Mario Mendoza";
        miLibro3.numeroDePaginas = 323;

        System.out.println("ISBN: " + miLibro3.isbn);
        System.out.println("Título: " + miLibro3.titulo);
        System.out.println("Autor: " + miLibro3.autor);
        System.out.println("Número de Páginas: " + miLibro3.numeroDePaginas);


        // creando clase libro
        Libro alejandroLibro = new Libro();

        alejandroLibro.isbn ="310-282-390-2";
        alejandroLibro.titulo = ("El Quijote");
        alejandroLibro.autor = ("Miguel de Cervantes");
        alejandroLibro.numeroDePaginas = 580;

        // imprimir
        System.out.println("isbn: " + alejandroLibro.isbn);
        System.out.println("ID: " + alejandroLibro.titulo);
        System.out.println("Titulo: " + alejandroLibro.autor);
        System.out.println("Autor: " + alejandroLibro.numeroDePaginas);



        //Libro Juan Ardila
        Libro miLibro1985 = new Libro();
        miLibro1985.isbn = "9780091360801";
        miLibro1985.titulo = "1985";
        miLibro1985.autor = "George Orwell";
        miLibro1985.numeroDePaginas = 235;

        System.out.println("ISBN - " + miLibro1985.isbn);
        System.out.println("Titulo - " + miLibro1985.titulo);
        System.out.println("Autor -" + miLibro1985.autor);
        System.out.println("Numero paginas - " + miLibro1985.numeroDePaginas);

        // Libro David Calle
        Libro miLibroDavid = new Libro();
        miLibroDavid.isbn = "900-45-57-11-127";
        miLibroDavid.titulo = "carta a mama";
        miLibroDavid.autor = "El imprevisto";
        miLibroDavid.numeroDePaginas = 101;
        miLibroDavid.prestar();



    }

}

