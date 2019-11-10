package lab2.challenge1;

public class Fighter {
        private String name;
        private int health;
        private int damagePerAttack;
        private static int numberofFighters=0;

        public Fighter(String name, int health, int damage){
            this.name=name;
            this.health=health;
            damagePerAttack=damage; //nu are acelasi denumire, deci nu trebuie sa folosim this
            numberofFighters++;
        }

        public void attack(Fighter opponent){ //ii scade din viata
            opponent.health=opponent.health-this.damagePerAttack;
        }

        public String toString(){
            return "Name: "+ name +" health: "+health+" Damage per attack: "+damagePerAttack;
        }

        public int getHealth(){
            return health;
        }

        public String getName(){
            return name;
        }

        public static int getNumberOfFighters(){
            return numberofFighters;
        }

}
