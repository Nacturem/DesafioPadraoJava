package Buttons;


    public class HtmlButton implements Button {

        public void render() {
            System.out.println("<button>Test Button</button>");
            onClick();
        }

        public void onClick() {
            System.out.println("Clique no Botão! - 'Bem vindo!'");
        }
    }





