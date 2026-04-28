package pekan4_2511531019;

public class QueueArrayDriver_2511531019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray_2511531019 queue_1019 = new QueueArray_2511531019(1000);
        
        queue_1019.enqueue_1019(10);
        queue_1019.enqueue_1019(20);
        queue_1019.enqueue_1019(30);
        queue_1019.enqueue_1019(40);
        
        System.out.println("Item di depan " + queue_1019.front_1019());
        System.out.println("item paling belakang " + queue_1019.rear_1019());
        System.out.println("tampilan queue");
        
        queue_1019.display_1019();
        
        System.out.println();
        System.out.println(queue_1019.dequeue_1019() + " dihapus dari queue");
        System.out.println("item di depan: " + queue_1019.front_1019());
        System.out.println("item dibelakang : " + queue_1019.rear_1019());
        System.out.println("tampilan queue setelah satu data dihapus");
        
        queue_1019.display_1019();
	}

}
