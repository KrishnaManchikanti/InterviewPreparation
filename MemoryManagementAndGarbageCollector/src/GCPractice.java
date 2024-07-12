public class GCPractice {

    @Override
    protected void finalize() throws Throwable {
        try {
            // Perform cleanup actions here
            System.out.println("Finalized method is called for object: " + this);
        } finally {
            super.finalize(); // Deprecated and potentially unnecessary
        }
    }

    public static void main(String[] args) {
        GCPractice gcp1 = new GCPractice();
        GCPractice gcp2 = new GCPractice();
        GCPractice gcp3 = new GCPractice();

        new GCPractice();
        gcp1 = null; // Mark gcp1 as eligible for garbage collection
        gcp2 = gcp3; // Reassign gcp2 to gcp3, making previous gcp2 eligible for garbage collection

        System.gc(); // Request garbage collection (finalize() may or may not be called immediately)
    }
}
