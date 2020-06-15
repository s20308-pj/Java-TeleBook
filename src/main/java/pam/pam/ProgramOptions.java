package pam.pam;

public enum ProgramOptions {
    NAME_SEARCH("1", "Szukanie po nazwie"), NUMBER_SEARCH("2", "Szukanie po numerze"),
    ADD_NEW("3", "Dodaj nową pozycję"), DELETE("4", "Usuń pozycję"),
    EXIT("5", "Wyjście z programu");

    private String id;
    private String description;

    ProgramOptions(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static ProgramOptions fromId(Integer id) {
        ProgramOptions[] values = values();
        for (ProgramOptions options :values){
            if (options.getId().equals(id));
            return options;
        }
        return null;
    }
}
