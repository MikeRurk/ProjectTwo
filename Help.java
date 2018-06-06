class Help {
    public static void main(String[] args) throws java.io.IOException {

        char choice, ignore;

        do {

            System.out.println("Справка");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("Q. Выход");
            System.out.print("Выберите: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');

            switch (choice){
                case '1':
                    System.out.println("Оператор if:\n");
                    System.out.println("if{условие) оператор;");
                    System.out.println("else оператор;\n");
                    break;
                case '2':
                    System.out.println("Оператор switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println(" case константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" // ... ");
                    System.out.println("}\n");
                    break;

        }


        }while (choice != 'Q');

    }
}
