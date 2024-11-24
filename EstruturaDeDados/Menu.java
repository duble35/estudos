public class Menu {
    public void lnkMenu(){
        
        String[]menu = new String[5];
        menu[0] = "Home";
        menu[1] = "Utils";
        menu[2] = "Sobre";
        menu[3] = "Links Úteis";
        menu[4] = "Configurações";

        menu[2] = "Agenda";
        
        for(int i = 0; i<menu.length;i++){
            System.out.println(menu[i]+" => "+i);
        }

    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        System.out.println("Escolha uma opção");
        menu.lnkMenu();
    }
}
