package org.example;

import java.io.*;

class NoteManager {
    private static final String FILE_NAME = "notes.txt";

    private boolean isValid(String note) {
        if (note == null) return false;
        String trimmed = note.trim();
        return trimmed.length() >= 3 && trimmed.length() <= 100;
    }

    public void saveNote(String note) {
        if (!isValid(note)) return;

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true));
            bw.write(note);
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Error saving note: " + e.getMessage());
        }
    }

    public void saveAllNotes(String[] notes) {
        if (notes == null) {
            System.out.println("No notes to save");
            return;
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));

            for(String note : notes) {
                if (isValid(note)) {
                    bw.write(note);
                    bw.newLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Error saving notes to: " + e.getMessage());
        }
    }

    public void printAllNotes() {
        File file = new File(FILE_NAME);
        if(!file.exists()) {
            System.out.println("No notes file found");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            int lineNumber = 1;

            while((line = br.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }
        } catch (Exception e) {
            System.out.println("Error saving notes to: " + e.getMessage());
        }
    }

    public int countNotes() {
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            while(br.readLine() != null) {
                count++;
            }

        } catch (FileNotFoundException e) {
            return 0;
        } catch (IOException e) {
            System.out.println("Error counting notes");
        }

        return count;
    }

    public static void main(String[] args) {
        NoteManager manager = new NoteManager();

        manager.saveNote("valid note");
        manager.saveNote(null);
        manager.saveNote("hi");

        String[] notesArray = {
                "Study java iterators",
                "",
                "read file manipulation chapter",
                " ",
                "prepare junit tests"
        };

        manager.saveAllNotes(notesArray);
        manager.printAllNotes();
        System.out.println("Total notes: " + manager.countNotes());
    }

}
