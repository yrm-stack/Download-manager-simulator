Download Manager Simulator (Java Multithreading Project)

Overview:
This project simulates a basic Download Manager that uses Java multithreading
to download multiple files simultaneously. The core objective is to demonstrate
how threads in Java can run tasks concurrently, allowing downloads to happen in
parallel instead of sequentially.

Features:
- Uses Java's Runnable interface to define download tasks.
- Starts multiple threads to download different files at the same time.
- Simulates the download progress with timed intervals.
- Shows thread names and progress updates for each download, highlighting thread independence.

How It Works:
Each file download is represented by a separate instance of the FileDownloader 
class, which implements the Runnable interface. These tasks are run in parallel
via distinct threads. The download progress is printed in real time, and the
main thread remains free to perform other tasks — illustrating non-blocking,
concurrent execution.

Code Structure:
- FileDownloader.java
  - Implements Runnable.
  - Simulates file download in five steps with percentage progress.
  - Reports the starting and completion of each task, along with which thread is executing it.

- project.java
  - The main entry point.
  - Creates three threads for three different files.
  - Starts all threads and prints a message from the main thread, showing main thread independence.

Sample Output:
Download Manager Started

Starting download: File1.pdf on Thread-1
Starting download: File2.mp4 on Thread-2
Starting download: File3.zip on Thread-3
Main thread is free to do other tasks...

Downloading File1.pdf ... 20% completed
Downloading File2.mp4 ... 20% completed
Downloading File3.zip ... 20% completed
...
Download completed: File1.pdf on Thread-1
Download completed: File2.mp4 on Thread-2
Download completed: File3.zip on Thread-3

How to Run:
1. Save both classes (FileDownloader and project) in your project directory.
2. Compile the project using a Java compiler, e.g.:
   javac project.java
3. Run the project:
   java project

Learning Objectives:
- Understand the basics of Java multithreading using the Runnable interface and Thread class.
- Observe how simultaneous downloads are managed without waiting for one to finish before starting the next.
- See how the main application remains responsive while concurrent tasks run in parallel.
