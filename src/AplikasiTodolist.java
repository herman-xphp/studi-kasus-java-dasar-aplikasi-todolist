public class AplikasiTodolist {

  public static String[] model = new String[10];

  public static void main(String[] args) {

    testShowTodoList();

  }

  /**
   * Menampilkan todo list
   */
  public static void showTodoList() {
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo);
      }
    }
  }

  /**
   * Unit test method showTodoList
   */
  public static void testShowTodoList() {
    model[0] = "Belajar Java Dasar";
    model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
    showTodoList();
  }

  /**
   * Menambah todo list
   */
  public static void addTodoList() {

  }

  /**
   * Menghapus todo list
   */
  public static void removeTodoList() {

  }

  /**
   * Menampilkan view todo list
   */
  public static void viewShowTodoList() {

  }

  /**
   * Menampilkan view tambah todo list
   */
  public static void viewAddTodoList() {

  }

  /**
   * Menampilkan view hapus todo list
   */
  public static void viewRemoveTodoList() {

  }
}
