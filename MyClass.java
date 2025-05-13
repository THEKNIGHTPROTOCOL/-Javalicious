try {
    Class c = Class.forName("MyClass");
    Object obj = c.newInstance();
} catch (Exception e) {
    System.out.println(e);
}
