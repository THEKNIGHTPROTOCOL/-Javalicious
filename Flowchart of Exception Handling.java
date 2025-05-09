        +------------------+
        | Normal Code      |
        | in try block     |
        +------------------+
                  |
                  v
     Exception Occurs? (Yes/No)
         /           \
       No             Yes
       |              |
Continue to        Jump to
 finally or        catch block
 next line            |
       \              v
        \        Handle Exception
         \             |
          \            v
          +---------> finally block
