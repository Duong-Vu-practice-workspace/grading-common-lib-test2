# Common Library

Shared library cho Web Programming Grading Platform.

## Cach su dung

### Buoc 1: Download va install tu GitHub Releases

```bash
python3 install-common-lib.py
```

Hoac download thu cong tu: https://github.com/Duong-Vu-practice-workspace/grading-common-lib-test2/releases

```bash
mvn install:install-file \
  -Dfile=common-lib-1.0.0.jar \
  -DgroupId=com.ptit.grading \
  -DartifactId=common-lib \
  -Dversion=1.0.0 \
  -Dpackaging=jar \
  -DgeneratePom=true
```

### Buoc 2: Them dependency vao pom.xml

```xml
<dependencies>
  <dependency>
    <groupId>com.ptit.grading</groupId>
    <artifactId>common-lib</artifactId>
    <version>1.0.0</version>
  </dependency>
</dependencies>
```

### Buoc 3: Build service

```bash
mvn clean package -DskipTests
```

## Chua dung

- BaseEntity
- GradingJob DTO
- SubmissionStatus enum
- FeignClientFactory
- GsonConfig
- Micrometer Tracing
