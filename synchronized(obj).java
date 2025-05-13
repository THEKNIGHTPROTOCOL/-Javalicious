synchronized(obj) {
    while(conditionNotMet)
        obj.wait();  // releases lock
    obj.notify();   // wakes up one thread
}
