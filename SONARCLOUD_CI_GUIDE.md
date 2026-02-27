# SonarCloud & CI/CD Setup Guidance

## SonarCloud Free Tier
- Go to https://sonarcloud.io/ and sign up with your GitHub account (free tier available for public repos).
- Create a new project, link your GitHub repo, and get:
  - Organization key
  - Project key
  - Generate a SonarCloud token (free tier)
- Add these as GitHub secrets in your repo settings:
  - `SONAR_ORG`
  - `SONAR_PROJECT_KEY`
  - `SONAR_TOKEN`

## GitHub Actions CI/CD
- The provided workflow runs on every push and PR to `main`.
- Steps:
  1. Checkout code
  2. Set up JDK 17
  3. Cache SonarCloud packages
  4. Run SonarCloud scan
  5. Build with Maven
  6. Run JUnit tests
- All steps are aligned and run in sequence.

## Notes
- No paid accounts required for SonarCloud public repo analysis.
- For private repos, SonarCloud may require a paid plan.
- JUnit tests will run if you add them to your Maven project.
