//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Compteur c1,c2,c3;
c1=new Compteur(0);
c1.increment();
c2=new Compteur(1);
c3=c1;
if(c1==c3){
    System.out.println("c1 et c3 sont egaux");
}else{
    System.out.println("c2 et c3 ne sont pas egaux");
}
if(c1.value()==c2.value()){
    System.out.println("c1 et c2 est meme valeur");
}else {
    System.out.println("c1 et c2 ne pas  meme valeur");

}
if (c1==c2){
    System.out.println("c1 et c2 sont egaux");
}else{
    System.out.println("c2 et c3 ne sont pas egaux");
}
if (c1.value()==c1.increment().value()){
    System.out.println("c1 et c1 increment en meme valeur");
}else{
    System.out.println("c1 et c1 increment nont pas meme valeur");
}



    }
}