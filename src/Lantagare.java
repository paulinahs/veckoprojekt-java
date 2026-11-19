public class Lantagare {

    private String namn;
    private int antalLan;

    private static int antalLantagare = 0;

    public Lantagare(String namn) {
        this.namn = namn;
        this.antalLan = 0;
        antalLantagare++;
    }

    public String getNamn() {
        return namn;
    }

    public int getAntalLan() {
        return antalLan;
    }

    public static int getAntalLantagare() {
        return antalLantagare;
    }

    public void visa() {
        System.out.println(namn + " har " + antalLan + " lån");
    }

    public void lana() {
        antalLan = antalLan + 1;
    }

    public void lamna() {
        if (antalLan > 0) {
            antalLan = antalLan - 1;
        } else {
            System.out.println(namn + " har inga lån att lämna tillbaka");
        }
    }
}





// public class Lantagare {
   // String namn;
   // int antalLan;

  //  public Lantagare(String namn) {
    //    this.namn = namn;
    //    this.antalLan = 0;
  //  }


 //   public void visa() {
   //     System.out.println(namn + " har " + antalLan + " lån");
  //  }

  //  public void lana() {
    //    antalLan = antalLan + 1;
  //  }

 //   public void lamna() {
   //     if (antalLan > 0) {
   //         antalLan = antalLan - 1;
   //     } else {
   //         System.out.println(namn + " har inga lån att lämna tillbaka");
   //     }
 //   }

   // public int lanKvar() {
     //   return 5 - antalLan;
  //  }
// }