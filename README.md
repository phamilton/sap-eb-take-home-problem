# The answer will be in sap_problem branch

The project follows a Controller-Service-Repository (CSR) design pattern, using Java Spring Boot Web for the implementation. Typically, the repository layer would utilize JPARepository, but in this case, since the data is being read from a CSV file, I have handled the logic at the repository level.

Strengths - Java Spring Boot is well-suited for this project due to its multi-threading capabilities, allowing it to efficiently manage heavy traffic.
Weaknesses - Compared to Python, Java can be less convenient for reading and processing data, as Python offers simpler tools for data handling and transformation.

If I had more time to dedicate to this project, I would explore other programming languages or potentially build a front-end to complement the backend functionality.

## API Details:

- It has 2 apis in this assignment.
1st api use to get all BoulderTrailHead entities(info)

Url (Get) : http://localhost:8080/api/v1/findAll 
return all entities as Json format

2nd api use to get  BoulderTrailHead entities that you selected

Url (Post) : http://localhost:8080/api/v1/findAll 
payload:
{
    "restrooms": false,
    "picnic": true
}

return all entities which restrooms are false and picnic is true
