package pam.pam;

public enum ProgramOptions {
    NAME_SEARCH("1", "Szukanie po nazwie"),
    NUMBER_SEARCH("2", "Szukanie po numerze"),
    ADD_NEW("3", "Dodaj nową pozycję"),
    DELETE("4", "Usuń pozycję"),
    EXIT("5", "Wyjście z programu");

    private final String id;
    private final String description;

    private ProgramOptions(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static ProgramOptions fromId(String id) {
        ProgramOptions[] values = values();
        for (ProgramOptions optionId : values) {
            if (optionId.getId().equals(id)) ;
            return optionId;
        }
        return null;
    }
}
