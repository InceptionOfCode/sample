# sample

This repository contains 25 Maven modules:

- `project-01` through `project-12`: shared libraries
- `project-13` through `project-25`: Spring Boot applications

Applications depend on libraries (roughly 50/50 app/library split across modules).

Build all modules from the repository root:

```bash
mvn test
```
