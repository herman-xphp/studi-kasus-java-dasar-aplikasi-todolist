public class AplikasiTodolist {

  public static String[] model = new String[10];

  public static void main(String[] args) {

    testAddTodoList();

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
  public static void addTodoList(String todo) {

  // cek apakah model penuh
    var isFull = true;
    for (String s : model) {
      if (s == null) {
        isFull = false;
        break;
      }
    }

    // jika penuh, risize ukuran model 2x lipat
   if (isFull){
     var temp = model;
     model = new String[model.length * 2];

     System.arraycopy(temp, 0, model, 0, temp.length);
   }

  // tambahkan ke posisi array yang NULL
    for (var i = 0; i < model.length; i++){
      if (model[i] == null){
        model[i] = todo;
        break;
      }
    }
  }

  // Unit test method addTodoList()
  public static void testAddTodoList(){
    for (int i = 0; i < 25; i++) {
      addTodoList("Contoh todo ke. " + i);
    }

    showTodoList();
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
