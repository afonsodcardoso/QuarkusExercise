package org.acme;

import io.quarkus.cache.CacheInvalidateAll;     // import for the cache implementation
import io.quarkus.cache.CacheResult;            // import for the cache implementation
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LabSeqService {
    
    // define the cache name to be used
    @CacheResult(cacheName = "labseq-cache")
    public int calculateLabSeq(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else if (n == 2 || n == 3) {
            return n - 2;
        }

        // all the returns of this method are cached in the cache named "labseq-cache"
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 0;
        cache[3] = 1;

        for (int i = 4; i <= n; i++) {
            cache[i] = cache[i - 4] + cache[i - 3];
        }
        
        // value stored in the cache
        return cache[n];
    }

    @CacheInvalidateAll(cacheName = "labseq-cache") // method to invalidate the cache manually
    public void invalidateCache() {
    }                                               
}
