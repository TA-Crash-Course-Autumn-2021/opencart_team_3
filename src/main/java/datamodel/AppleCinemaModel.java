package datamodel;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AppleCinemaModel {

    private int radio;// 5, 6 or 7
    private int checkbox;// 8, 9, 10 or 11
    private String text;
    private int select; // 4, 3, 2 or 1
    private String textArea;
    private String uploadFile;
    private String date;
    private String time;
    private String dateAndTime;
    private String quantity;
}