package FundamentalJava;

public class AplikasiTodolist {

    //Membuat Model (representasi dari data)
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testAddTodolist();

    }

    //membuat busines logic dari aplikasi
    public static void showTodolist() {
        for (int a = 0; a < model.length; a++) {
            var todo = model[a];
            var no = a + 1;
            if (todo != null) {
                System.out.println(" " + todo);
            }
        }
    }

    //testing show
    public static void testShowTodolist() {
    
        showTodolist();
    }

    public static void addTodolist(String todo) {
        //cel apakah array penuh
        var isFull = true;
        for (int a = 0; a < model.length; a++) {
            if (model[a] == null) {
                //model masih ada yang penuh
                isFull = false;
                break;

            }

        }
        //jika penuh kita resize ukuran array
        if (isFull) {
            var tem = model;
            model = new String[model.length * 2];

            for (int a = 0; a < tem.length; a++) {
                model[a] = tem[a];
            }
        }
        //tambahkan ke posisi array yang null
        for (int a = 0; a < model.length; a++) {
           
            if (model[a] == null) {
                model[a] = todo;
                break;
            }
        }
    }

    //testing add
    public static void testAddTodolist() {
        for (int a = 0; a < 25; a++) {
            addTodolist("ke"+a);
        }
        showTodolist();
    }

    public static void removeTodolist(Integer number) {
        

    }

    //membuat view dari aplikasi 
    public static void viewShowTodolist() {

    }

    public static void viewAddTodolist() {

    }

    public static void viewRemoveTodolist() {

    }
}
