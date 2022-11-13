# java19 New Features 

Here will add all features related to java 19 and some examples related to it 


Structured concurrency
This feature of Java 19 aims to simplify multithread programming with the help of a structured concurrency API. If there are several tasks running in different threads, the concurrency will treat them all as a single unit of work, hence, streamlining the error handling and cancellation. 

Here are the main improvements that structured concurrency is supposed to bring:

In case of a canceled calling thread, subtasks are canceled too;
In case of an error in any subtask, other subtasks get canceled;
Visible call hierarchy between the calling thread and the subtask-executing threads that can be seen in the thread dump;
No thread pool - instead, each subtask is executed in a separate virtual thread.

as example of this  check handle method in the ConcurrencyFeatureComponent  
