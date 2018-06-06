package Help;

class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {

        char choice, ignore;
        Help hlp = new Help();

        do {
            hlp.showmenu();
            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');

            hlp.helpon(choice);

        }while (choice != 'Q');

    }
}
