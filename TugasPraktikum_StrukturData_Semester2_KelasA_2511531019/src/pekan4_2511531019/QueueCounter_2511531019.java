package pekan4_2511531019;
public class QueueCounter_2511531019 {
	int maks_1019 = 15;
    String[] queue_1019 = new String[maks_1019];
    int front_1019 = -1;
    int rear_1019 = -1;
    boolean isEmpty_1019() {
        return front_1019 == -1;
    }
    boolean isFull_1019() {
        return rear_1019 == maks_1019 - 1;
    }
    void enqueue_1019(String nama_1019) {
        if (isFull_1019()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_1019()) {
                front_1019 = 0;
            }
            rear_1019++;
            queue_1019[rear_1019] = nama_1019;
            System.out.println(nama_1019 + " masuk ke antrian.");
        }
    }
    void dequeue_1019() {
        if (isEmpty_1019()) {
            System.out.println("Antrian kosong!");
        } else {
            String nama_1019 = queue_1019[front_1019];
            System.out.println(nama_1019 + " dipanggil keluar dari antrian.");

            if (front_1019 == rear_1019) {
                front_1019 = rear_1019 = -1;
            } else {
                front_1019++;
            }
        }
    }   
    void display_1019() {
        if (isEmpty_1019()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Isi antrian: ");
            int nomor_1019 = 1;
            for (int i_1019 = front_1019; i_1019 <= rear_1019; i_1019++) {
                System.out.print(nomor_1019 + ". " + queue_1019[i_1019] + " ");
                nomor_1019++;
            }
            System.out.println();
        }
    }
    void Reverse_1019() {
        if (isEmpty_1019()) {
            System.out.println("Antrian kosong, tidak bisa dibalik!");
        } else {
            int i_1019 = front_1019, j_1019 = rear_1019;
            while (i_1019 < j_1019) {
                String temp_1019 = queue_1019[i_1019];
                queue_1019[i_1019] = queue_1019[j_1019];
                queue_1019[j_1019] = temp_1019;
                i_1019++;
                j_1019--;
            }
            System.out.println("Antrian berhasil dibalik.");
        }
    }
}
