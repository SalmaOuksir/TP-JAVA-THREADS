public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Talkative talkative = new Talkative(i);
            Thread thread = new Thread(talkative);
            thread.start();
        }
    }
}

//Après avoir exécuté ce code,
// nous constatons que les valeurs affichées par chaque thread sont mélangées et ne sont pas affichées dans l'ordre.Cela est dû au fait que chaque thread s'exécute indépendamment des autres,
// et leur ordre d'exécution n'est pas garanti.