# maska

Case Study: Directly use JPA model to produce JSON response.

1. JsonIgnore annotation is used to avoid infinite loop for the model who has one-to-many (and other) relationship.
2. it is hard to maintain if the web service is in large scale.
3. Not a good practice to use JPA model as JSON response.


Tech Stacks:

- Spring boot
- Wildfly
- Java 8 Collection
- Hibernate
- MySql
- Jersey
