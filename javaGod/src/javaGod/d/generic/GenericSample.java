package javaGod.d.generic;

public class GenericSample {
  
  public static void main(String[] args) {
    GenericSample sample = new GenericSample();
    sample.checkCastingDTO();

    CastingDTO castingDTO = new CastingDTO();
    castingDTO.setObject(new StringBuffer());
    sample.checkDTO(castingDTO);
  }

  private void checkCastingDTO() {
    CastingDTO dto1 = new CastingDTO();
    dto1.setObject(new String());

    CastingDTO dto2 = new CastingDTO();
    dto2.setObject(new StringBuffer());

    CastingDTO dto3 = new CastingDTO();
    dto3.setObject(new StringBuffer());
  }

  public void checkDTO(CastingDTO dto) {
    Object tempObject = dto.getObject();
    if(tempObject instanceof StringBuilder) {
      System.out.println("StrinbBuilder");
    } else if(tempObject instanceof StringBuffer) {
      System.out.println("StringBuffer");
    }

  }

  
}
