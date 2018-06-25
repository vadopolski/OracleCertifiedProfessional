public class MyLab {
    public static void getException() throws Exception {
        System.out.println("Test");
        Exception exp = null;
        try {
            System.out.println("Some code with possible exception");

            try {
                int i = (int) (Math.random() * 100);
                if (i % 2 == 0) {
                    throw new Exception("Try inner Exception");

                }

            } catch (Exception e) {
                exp = e;
                int j = (int) (Math.random() * 100);
                if (j % 2 == 0) {
                    throw new Exception("Catch inner Exception");
                }

                throw e;
            }
        } catch (Exception e) {
            System.out.println(exp.getMessage());
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) throws Exception {
        getException();
    }
}