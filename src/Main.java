public class Main {
    public static void main(String[] args) {
        System.out.println("=== Biblioteket öppnar ===");
        Bok hobbit = new Bok("Hobbit", "J.R.R. Tolkien", 310);
        Bok momo = new Bok("Momo", "Michael Ende", 250);
        Bok pippi = new Bok("Pippi Långstrump", "Astrid Lindgren", 160);
        Lantagare anna = new Lantagare("Anna");
        Lantagare omar = new Lantagare("Omar");
        System.out.println("Böcker i biblioteket: " + Bok.getAntal());

        System.out.println("=== " + anna.getNamn() + " lånar " + hobbit.getTitel() + " ===");
        boolean gick = hobbit.lanaUt();
        if (gick) {
            anna.lana();
        }
        System.out.println("Boken tar ungefär " + hobbit.lasminuter() + " minuter att läsa");

        System.out.println("=== " + omar.getNamn() + " vill också låna " + hobbit.getTitel() + " ===");
        gick = hobbit.lanaUt();
        if (gick) {
            omar.lana();
        }

        System.out.println("=== " + omar.getNamn() + " lånar " + pippi.getTitel() + " i stället ===");
        gick = pippi.lanaUt();
        if (gick) {
            omar.lana();
        }

        System.out.println("=== " + anna.getNamn() + " lämnar tillbaka " + hobbit.getTitel() + " ===");
        hobbit.lamnaTillbaka();
        anna.lamna();

        System.out.println("=== Biblioteket stänger ===");
        hobbit.visa();
        momo.visa();
        pippi.visa();
        anna.visa();
        omar.visa();
    }
}




// public class Main {
   // public static void main(String[] args) {
     //   System.out.println("Biblioteket öppnar");
     //   Bok hobbit = new Bok("Hobbit", "J.R.R. Tolkien", 310);
     //   Bok momo = new Bok("Momo", "Michael Ende", 250);
    //    Bok pippi = new Bok("Pippi Långstrump", "Astrid Lindgren", 160);
    //    System.out.println("Böcker i biblioteket: " + Bok.getAntal());
 //   }
// }

// public class Main {
 //   public static void main(String[] args) {
   //     System.out.println("Biblioteket öppnar");
   //     Bok hobbit = new Bok("Hobbit", "J.R.R. Tolkien", 310);
   //     Lantagare anna = new Lantagare("Anna");

     //   System.out.println(anna.getNamn() + " vill låna " + hobbit.getTitel() + " av " + hobbit.getForfattare());
     //   boolean gick = hobbit.lanaUt();
     //   if (gick) {
     //       anna.lana();
     //   }
     //   System.out.println(anna.getNamn() + " har nu " + anna.getAntalLan() + " lån");
  //  }
// }



//public class Main {
   // public static void main(String[] args) {
     //   System.out.println("Biblioteket öppnar");
     //   Bok hobbit = new Bok("Hobbit", "J.R.R. Tolkien", 310);
     //   Bok momo = new Bok("Momo", "Michael Ende", 250);
     //   Bok pippi = new Bok("Pippi Långstrump", "Astrid Lindgren", 160);
     //   Bok yellow = new Bok("Yellowface", "RH Kuang", 450);
     //   System.out.println(hobbit.titel + " av " + hobbit.forfattare);
     //   System.out.println(momo.titel + " av " + momo.forfattare);
      //  System.out.println(pippi.titel + " av " + pippi.forfattare);
      //  System.out.println(yellow.titel + " av " + yellow.forfattare);

      //  Lantagare anna = new Lantagare("Anna");
      //  Lantagare omar = new Lantagare("Omar");
      //  Lantagare paulina = new Lantagare("Paulina");

      //  hobbit.lanaUt();
      //  anna.lana();
      //  hobbit.visa();
      //  anna.visa();

      //  hobbit.lamnaTillbaka();
      //  anna.lamna();
      //  hobbit.visa();
      //  anna.visa();

      //  System.out.println("Anna kan låna " + anna.lanKvar() + " böcker till");
      //  System.out.println("Omar kan låna " + omar.lanKvar() + " böcker till");
      //  System.out.println("Paulina kan låna " + paulina.lanKvar() + " böcker till");

      //  int minuter = hobbit.lasminuter();
       // System.out.println("Hobbit tar ungefär " + minuter + " minuter att läsa");


   // boolean gick = hobbit.lanaUt();
     //   if (gick) {
     //   anna.lana();
  //  }

  //  gick = hobbit.lanaUt();
    //    if (gick) {
    //    omar.lana();
  //  }

    //    anna.visa();
     //   omar.visa();


// for (int forsok = 1; forsok <= 3; forsok++) {
   //     System.out.println("Försök " + forsok);
   //     momo.lanaUt();
  //  }

    //    pippi.lamnaTillbaka();
    //    omar.lamna();
// }

// }