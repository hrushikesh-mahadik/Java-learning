public class l{
  
         String name;
         int year;
         Book[] books;
            l(String name, int year, Book[] books){
                this.name = name;
                this.year = year;
                this.books = books;
            }
            void displayinfo(){
                String info = "Library Name: " + this.name + "\nYear Established: " + this.year + "\nBooks:\n";
                for (Book book : books) {
                    info += "- " + book.displayinfo() + "\n";
                }
                System.out.println(info);
            }
        }
     