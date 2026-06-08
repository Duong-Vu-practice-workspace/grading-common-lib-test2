# Common Library

Shared library cho Web Programming Grading Platform.

## Cach su dung

### Buoc 1: Setup Maven authentication

```bash
python3 setup-maven.py <github-username> <github-token>
```

Hoac tao thu cong `~/.m2/settings.xml`:

```xml
<settings>
  <servers>
    <server>
      <id>github</id>
      <username>YOUR_GITHUB_USERNAME</username>
      <password>YOUR_GITHUB_TOKEN</password>
    </server>
  </servers>
</settings>
```

### Buoc 2: Publish len GitHub Packages

```bash
cd services/common-lib
mvn clean deploy -DskipTests
```

### Buoc 3: Su dung trong service

Da co san trong pom.xml moi service:

```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/Duong-Vu-practice-workspace/grading-common-lib-test2</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.ptit.grading</groupId>
    <artifactId>common-lib</artifactId>
    <version>1.0.0</version>
  </dependency>
</dependencies>
```

### Buoc 4: Build service

```bash
cd services/assignment-service
mvn clean package -DskipTests
```

## Chua dung

- BaseEntity
- GradingJob DTO
- SubmissionStatus enum
- FeignClientFactory
- GsonConfig
- Micrometer Tracing
