class MyHashMap() {
    private val bucketSize = 1000
    data class Node(val key:Int = -1,var value:Int = -1,var next: Node? = null)    
    private val buckets = Array(bucketSize) { Node() }


    private fun getHash(key:Int):Int{
        return key % bucketSize
    }

    fun put(key: Int, value: Int) {
        val index = getHash(key)
        var bucket = buckets[index]
        while(bucket.next != null){
            if(bucket.next!!.key == key){
                bucket.next!!.value = value
                return
            }
            bucket = bucket.next!!
        }
        bucket.next = Node(key, value)
        
    }

    fun get(key: Int): Int {
        val index = getHash(key)
        var bucket = buckets[index]
        while(bucket.next != null){
            if(bucket.next!!.key == key){
                return bucket.next!!.value
            }
            bucket = bucket.next!!
        }
        return -1  
        
    }

    fun remove(key: Int) {
        val index = getHash(key)
        var bucket = buckets[index]
        while(bucket.next != null){
            if(bucket.next!!.key == key){
                bucket.next = bucket.next!!.next
                return 
            }
            bucket = bucket.next!!
        }
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */