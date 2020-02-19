package tomtomInterview;

public class AtomicVolatile {
	/*
	 * making a variable volatile : when thread1 changes the value of variable then
	 * it changes and updated for thread2 as well if variable is volatile.
	 * it used to solve the visibility problem.
	 * 
	 * 
	 * value++ = two operation, reading and adding updating.
	 * in this case both thread1 and thread2 read together and value will be 1
	 * after some time thread1 update the value by 2 but thread2 has already read value which is 1.
	 * then it again update the value and final value will be 2 ...instead of 3
	 * 
	 * volatile value =1
	 * thread1                                        thread2
	 * first thread1 reads 							first thread2 reads 
	 *              						
	 * value++										value++
	 * values become = 2							thread 2 does not read last value from thread1
	 * it because it has alread read value .
	 * 
	 * 
	 * to solve this problem we can use synchronised
	 * 
	 * to ensure only one thread will come and execute.
	 * 
	 * synchronized (obj){
	 * obj++;
	 * }
	 * 
	 * second way is atomatic value(compount operation).
	 * 
	 * AtomicIneger value  = new AtomicInteger(1);
	 * value.increament();
	 * increamentAndGet
	 * decrementAndGet
	 * addAndGet
	 * compareAndSet
	 * 
	 * volatile = flag
	 * atomicInteger : counter 
	 * 
	 */
}
