package src.main.java.builder;

public enum Profession {
  ENGINEER("enginner"),
  RECRUITER("recruiter"),
  SALESMAN("salesman");

  private final String profession;

  Profession(String profession) {
    this.profession = profession;
  }

  @Override
  public String toString() {
    return profession;
  }
}
