

// Multithreading Project: Download Manager Simulator
// core concet - downloads two file at the same time , highlighting multithreading core concept.

class FileDownloader implements Runnable {
    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Starting download: " + fileName + " on " + Thread.currentThread().getName());
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Downloading " + fileName + " ... " + (i * 20) + "% completed");
                Thread.sleep(500); // Simulating time delay for download
            }
        } catch (InterruptedException e) {
            System.out.println("Download interrupted for: " + fileName);
        }
        System.out.println("Download completed: " + fileName + " on " + Thread.currentThread().getName());
    }
}

public class project {
    public static void main(String[] args) {
        System.out.println("Download Manager Started\n");

        // Creating multiple threads for different file downloads
        Thread file1 = new Thread(new FileDownloader("File1.pdf"), "Thread-1");
        Thread file2 = new Thread(new FileDownloader("File2.mp4"), "Thread-2");
        Thread file3 = new Thread(new FileDownloader("File3.zip"), "Thread-3");

        // Starting threads
        file1.start();
        file2.start();
        file3.start();

        // Main thread continues executing
        System.out.println("Main thread is free to do other tasks...\n");
    }
}

