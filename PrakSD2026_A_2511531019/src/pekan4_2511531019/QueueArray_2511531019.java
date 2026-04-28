package pekan4_2511531019;

public class QueueArray_2511531019 {
	int front_1019, rear_1019, size_1019;
	int capacity_1019;
	int array_1019[];
	
	public QueueArray_2511531019(int capacity_1019) {
		this.capacity_1019 = capacity_1019;
		front_1019 = this.size_1019 = 0;
		rear_1019 = capacity_1019 - 1;
		array_1019 = new int[this.capacity_1019];
	}
	
	boolean isFull_1019(QueueArray_2511531019 queue_1019) {
		return (queue_1019.size_1019 == queue_1019.capacity_1019);
	}
	
	boolean isEmpty_1019(QueueArray_2511531019 queue_1019) {
		return (queue_1019.size_1019 == 0);
	}
	
	void enqueue_1019(int item_1019) {
		if (isFull_1019(this)) return;
		this.rear_1019 = (this.rear_1019 + 1) % this.capacity_1019;
		this.array_1019[this.rear_1019] = item_1019;
		this.size_1019 = this.size_1019 + 1;
		System.out.println(item_1019 + " enqueue to queue");
	}
	int dequeue_1019() {
		if (isEmpty_1019(this)) return Integer.MIN_VALUE;
		int item_1019 = this.array_1019[this.front_1019];
		this.front_1019 = (this.front_1019 + 1) % this.capacity_1019;
		this.size_1019 = this.size_1019 - 1;
		return item_1019;
	}
	int front_1019() {
		if (isEmpty_1019(this)) return Integer.MIN_VALUE;
		return this.array_1019[this.front_1019];
	}
	int rear_1019() {
		if (isEmpty_1019(this)) return Integer.MIN_VALUE;
		return this.array_1019[this.rear_1019];
	}
	//mencetak elemen antrian
	void display_1019() {
		int i_1019;
		if (front_1019 == rear_1019) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		// kunjungi dari belakang dan cetak
		for (i_1019 = front_1019; i_1019 < rear_1019; i_1019++) {
			System.out.printf(" %d <-- ", array_1019[i_1019]);
		}
		return;
	}
}
