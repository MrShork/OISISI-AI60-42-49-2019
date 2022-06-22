//package view;
//
//import javax.swing.table.AbstractTableModel;
//
//import model.BaseofSoftware;
//
//public class SoftverTableModel extends AbstractTableModel {
//
//	SoftverTableModel(){
//	}
//	
//	@Override
//	public int getRowCount() {
//		return BaseofSoftware.getInstance().getSubjects().size();
//	}
//	
//	@Override
//	public int getColumnCount() {
//		return BaseofSoftware.getInstance().getColumnCount();
//	}
//
//	@Override
//	public String getColumnName(int column) {
//		return BaseofSoftware.getInstance().getColumnName(column);
//	
//}
//
//	@Override
//	public Object getValueAt(int rowIndex, int columnIndex) {
//		// TODO Auto-generated method stub
//		return BaseofSoftware.getInstance().getValueAt(rowIndex, columnIndex);
//
//	}
//}
