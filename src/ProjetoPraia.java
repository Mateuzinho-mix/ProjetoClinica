public class ProjetoPraia{
    public static void main(String args[]){
        Crianca c1=new Crianca();
        c1.altura=1.6;
        c1.corCabelo="Loiro";
        c1.corPele="Branca";
        c1.idade=10;
        c1.brincar();
        c1.correr(100);
        c1.sorrir();
        String sorriso=c1.sorrir();
        System.out.println(sorriso);

        Planta p1=new Planta();
        p1.corFolha="Verde";
        p1.corTronco="Marrom";
        p1.altura=3.5;
        p1.crescer();
        p1.respirar();


    }
}
