package custom_swing;

import tabel_jadwal.ClassJadwal;

public class ModelAction {

    public ClassJadwal getStudent() {
        return student;
    }

    public void setStudent(ClassJadwal student) {
        this.student = student;
    }

    public EventAction getEvent() {
        return event;
    }

    public void setEvent(EventAction event) {
        this.event = event;
    }

    public ModelAction(ClassJadwal student, EventAction event) {
        this.student = student;
        this.event = event;
    }

    public ModelAction() {
    }

    private ClassJadwal student;
    private EventAction event;
}
