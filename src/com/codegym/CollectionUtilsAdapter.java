package com.codegym;

import java.util.Set;

public abstract class CollectionUtilsAdapter extends CollectionOperations {
    CollectionOperations collectionOperations;
    public void CollectionOperations () {
        this.collectionOperations = new CollectionUtilsAdapter() {
            @Override
            public int findMax(Set<Integer> numbers) {
                return 0;
            }
        };
    }
}
