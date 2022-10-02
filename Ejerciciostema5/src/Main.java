public class Main {
        static CocheCRUD cocheCrud = new CocheCRUDImpl();

        public Main() {
        }

        public static void main(String[] args) {
            cocheCrud.save();
            cocheCrud.findALL();
            cocheCrud.delete();
        }
}

class CocheCRUDImpl implements CocheCRUD {
        CocheCRUDImpl() {
        }

        public void save() {
            System.out.println("Ejecutando método save");
        }

        public void findALL() {
            System.out.println("Ejecutando método findALL");
        }

        public void delete() {
            System.out.println("Ejecutando método delete");
        }
}

interface CocheCRUD {
        void save();

        void findALL();

        void delete();
}

