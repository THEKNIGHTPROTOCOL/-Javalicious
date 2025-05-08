Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

// Union
Set<Integer> union = new HashSet<>(set1);
union.addAll(set2);

// Intersection
Set<Integer> intersection = new HashSet<>(set1);
intersection.retainAll(set2);

// Difference
Set<Integer> diff = new HashSet<>(set1);
diff.removeAll(set2);
