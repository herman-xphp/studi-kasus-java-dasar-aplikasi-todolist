public class AplikasiTodolist {

  public static String[] model = new String[10];
  public static java.util.Scanner scanner = new java.util.Scanner(System.in);

  public static void main(String[] args) {

    viewShowTodoList();
  }

  /**
   * Menampilkan todo list
   */
  public static void showTodoList() {
    System.out.println("TODOLIST");
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
  public static boolean removeTodoList(Integer number) {
    if ((number - 1) > model.length){
      return false;
    } else if (model[number - 1] == null) {
      return false;
    }else {
//      model[number - 1] = null;
//      return true;
      // number = 10 = 9
      // model.length = 9 = 8
      // model[i] = 9 = null


      for (var i = (number - 1); i < model.length; i++){
        if (i == model.length - 1){
          model[i] = null;
        }else {
          model[i] = model[i + 1];
        }
      }
      return true;
    }
  }

  // Unit test method removeTodoList()
  public static void testRemoveTodoList(){
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");

    var result = removeTodoList(20);
    System.out.println(result);

    result = removeTodoList(4);
    System.out.println(result);

    result = removeTodoList(2);
    System.out.println(result);

    showTodoList();
  }

  public static String input(String info) {
    System.out.print(info + " : ");
    String data = scanner.nextLine();
    return data;
  }

  public static void testInput(){
    var name = input("Name");
    System.out.println("Hi " + name);

    var channel = input("Channel");
    System.out.println(channel);
  }

  /**
   * Menampilkan view todo list
   */
  public static void viewShowTodoList() {

    while (true){
      showTodoList();

      System.out.println("MENU");
      System.out.println("1. Tambah");
      System.out.println("2. Hapus");
      System.out.println("x. Keluar");

      var input = input("Pilih");

      if (input.equals("1")){
        viewAddTodoList();
      } else if (input.equals("2")) {
        viewRemoveTodoList();
      } else if (input.equals("x")){
        break;
      } else {
        System.out.println("Pilihan tidak dimengerti");
      }
    }
  }

  public static void testViewShowTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");
    addTodoList("Tiga");
    addTodoList("Empat");
    viewShowTodoList();
  }

  /**
   * Menampilkan view tambah todo list
   */
  public static void viewAddTodoList() {
    System.out.println("MENAMBAH TODOLIST");

    var todo = input("Todo (x Jika Batal)");

    if (todo.equals("x")){
      // batal
    }else{
      addTodoList(todo);
    }
  }

  public static void testViewAddTodoList() {
    addTodoList("satu");
    addTodoList("dua");

    viewAddTodoList();

    showTodoList();
  }

  /**
   * Menampilkan view hapus todo list
   */
  public static void viewRemoveTodoList() {
    System.out.println("MENGHAPUS TODOLIST");

    var number = input("Nomor yang Dihapus (x Jika Batal)");

    if (number.equals("x")) {
      // batal
    }else{
      boolean success = removeTodoList(Integer.valueOf(number));
      if (!success) {
        System.out.println("Gagal menhapus todolist : " + number);
      }
    }
  }

  public static void testViewRemoveTodoList() {
    addTodoList("satu");
    addTodoList("dua");
    addTodoList("tiga");

    showTodoList();

    viewRemoveTodoList();

    showTodoList();
  }
}
