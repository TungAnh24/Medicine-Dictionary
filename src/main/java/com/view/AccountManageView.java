/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import com.controller.UserController;
import com.controller.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Huu Tung
 */
public class AccountManageView extends javax.swing.JFrame {

    UserDTO user;
    UserController userController = new UserController();
    List<UserDTO> allUserList;
    UserDTO selectedUser;
    DefaultTableModel userListTableModel;

    /**
     * Creates new form ManageView
     */
    public AccountManageView() {
        initComponents();
    }

    public AccountManageView(UserDTO user) {
        initComponents();
        this.user = user;
        txtCurUserName.setText(user.getUsername());
        txtCurPhone.setText(user.getPhone());
        userListTableModel = (DefaultTableModel) tbnUserList.getModel();
        loadUserList();
    }

    private void loadUserList() {
        allUserList = new ArrayList<>();
        userListTableModel.setRowCount(0);
        allUserList = userController.getAll();
        allUserList.stream().forEach(u -> {
            userListTableModel.addRow(new Object[]{
                u.getUsername(),
                u.getPhone(),
                u.getAutDescription(),
                u.getSttDescription()
            });
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtCurUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnUpdateCurUser = new javax.swing.JButton();
        txtNewPass1 = new javax.swing.JPasswordField();
        txtNewPass2 = new javax.swing.JPasswordField();
        txtCurPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNewUserName = new javax.swing.JTextField();
        btnNewAccount = new javax.swing.JButton();
        txtNewUserPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNewUserPass1 = new javax.swing.JPasswordField();
        txtNewUserPass2 = new javax.swing.JPasswordField();
        comboAuth = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbnUserList = new javax.swing.JTable();
        btnLockAccount = new javax.swing.JButton();
        btnResetPass = new javax.swing.JButton();
        btnUnlockAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tài khoản");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ TÀI KHOẢN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCurUserName.setEditable(false);

        jLabel2.setText("Tên đăng nhập:");

        jLabel4.setText("Mật khẩu mới:");

        jLabel5.setText("Nhập lại mật khẩu mới:");

        btnUpdateCurUser.setIcon(new javax.swing.ImageIcon("E:\\HocJava_DNU\\DictPharacy\\src\\main\\java\\com\\icon\\updated.png")); // NOI18N
        btnUpdateCurUser.setText("Cập nhật");
        btnUpdateCurUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCurUserActionPerformed(evt);
            }
        });

        txtNewPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPass2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Điện thoại:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUpdateCurUser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCurUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(txtCurPhone)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNewPass2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNewPass1))))
                        .addGap(8, 8, 8))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btnUpdateCurUser)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tài khoản của bạn", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Nhập lại mật khẩu:");

        jLabel7.setText("Mật khẩu:");

        jLabel6.setText("Tên đăng nhập:");

        btnNewAccount.setIcon(new javax.swing.ImageIcon("E:\\HocJava_DNU\\DictPharacy\\src\\main\\java\\com\\icon\\add-user.png")); // NOI18N
        btnNewAccount.setText("Thêm tài khoản");
        btnNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAccountActionPerformed(evt);
            }
        });

        jLabel10.setText("Điện thoại:");

        comboAuth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Admin", "Khách hàng" }));

        jLabel11.setText("Quyền hạn:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNewAccount))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewUserPhone)
                            .addComponent(txtNewUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(txtNewUserPass1)
                            .addComponent(txtNewUserPass2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(comboAuth, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNewUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewUserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNewUserPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewUserPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAuth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnNewAccount)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Thêm tài khoản", jPanel4);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbnUserList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên đăng nhập", "Điện thoại", "Loại tài khoản", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbnUserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbnUserListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbnUserList);

        btnLockAccount.setIcon(new javax.swing.ImageIcon("E:\\HocJava_DNU\\DictPharacy\\src\\main\\java\\com\\icon\\lock.png")); // NOI18N
        btnLockAccount.setText("Khóa tài khoản");
        btnLockAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLockAccountActionPerformed(evt);
            }
        });

        btnResetPass.setIcon(new javax.swing.ImageIcon("E:\\HocJava_DNU\\DictPharacy\\src\\main\\java\\com\\icon\\refresh.png")); // NOI18N
        btnResetPass.setText("Đặt lại mật khẩu");
        btnResetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPassActionPerformed(evt);
            }
        });

        btnUnlockAccount.setIcon(new javax.swing.ImageIcon("E:\\HocJava_DNU\\DictPharacy\\src\\main\\java\\com\\icon\\padlock.png")); // NOI18N
        btnUnlockAccount.setText("Mở khóa tài khoản");
        btnUnlockAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnlockAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLockAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnUnlockAccount)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetPass)
                    .addComponent(btnLockAccount)
                    .addComponent(btnUnlockAccount))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Danh sách tài khoản", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPass2ActionPerformed

    private boolean validateUserName(String userName) {
        return userName.trim().matches("\\w{3,10}$");
    }

    private boolean validatePhone(String phone) {
        return phone.trim().matches("^[0-9]{8,12}$");
    }

    private boolean validatePassword(String pass1, String pass2) {
        return (pass1.matches(".{6,}") && pass2.equals(pass1));
    }

    private void btnNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAccountActionPerformed
        // TODO add your handling code here:
        if (user.getAuthority() != 1) {
            JOptionPane.showMessageDialog(null, "Tài khoản của bạn không có quyền thực hiện chức năng này.", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        } else {
            String newUserName = txtNewUserName.getText();
            String newUserPhone = txtNewUserPhone.getText();
            String newUserPass1 = String.valueOf(txtNewUserPass1.getPassword());
            String newUserPass2 = String.valueOf(txtNewUserPass2.getPassword());
            int auth = comboAuth.getSelectedIndex();
            String nameDuplicate = userController.isDuplicateUser(newUserName) ? "Tên đăng nhập đã tồn tại. Hãy chọn tên khác.\n" : "";
            String nameErr = !validateUserName(newUserName) ? "Tên đăng nhập phải chứa từ 3 đến 10 ký tự.\n" : "";
            String phoneErr = !validatePhone(newUserPhone) ? "Số điện thoại phải có từ 8 đến 12 chữ số.\n" : "";
            String passErr = !validatePassword(newUserPass1, newUserPass2) ? "Mật khẩu phải có ít nhất 6 ký tự, 2 mật khẩu phải trùng khớp nhau." : "";
            String error = nameDuplicate + nameErr + phoneErr + passErr;
            if (!"".equals(error)) {
                JOptionPane.showMessageDialog(null, error, "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            } else {
                if (userController.addUser(newUserName, newUserPass1, newUserPhone, auth)) {
                    JOptionPane.showMessageDialog(null, "Tài khoản " + newUserName + " đã được tạo thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    txtNewUserName.setText("");
                    txtNewUserPhone.setText("");
                    txtNewUserPass1.setText("");
                    txtNewUserPass2.setText("");
                    comboAuth.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Không tạo được tài khoản, hãy kiểm tra kết nối database.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnNewAccountActionPerformed

    private int confirmOldPassword() {
        int result = 0;
        JPasswordField pwd = new JPasswordField(10);
        int ans = JOptionPane.showConfirmDialog(null, pwd, "Nhập mật khẩu hiện tại của bạn", JOptionPane.OK_CANCEL_OPTION);
        if (ans == 0) { //'OK' button is clicked
            String oldPass = String.valueOf(pwd.getPassword());
            if (userController.verifiedCurrentPass(user, oldPass)) {
                result = 1; //Password is entered and passed confirmation
            } else {
                result = -1; //Password is entered but NOT passed confirmation
            }
        } //"Cancel" button is clicked, result remains 0
        return result;
    }

    private void btnUpdateCurUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCurUserActionPerformed
        // TODO add your handling code here:
        String newPhone = txtCurPhone.getText();
        String newPass1 = String.valueOf(txtNewPass1.getPassword());
        String newPass2 = String.valueOf(txtNewPass2.getPassword());
        String error;
        String phoneErr = !validatePhone(newPhone) ? "Số điện thoại phải có từ 8 đến 12 chữ số.\n" : "";
        String passErr = (newPass1.isBlank() && newPass2.isBlank()) ? "" : !validatePassword(newPass1, newPass2) ? "Mật khẩu phải có ít nhất 6 ký tự, 2 mật khẩu phải trùng khớp nhau." : "";
        error = phoneErr + passErr;
        if (error.length() == 0) {
            int confirm = confirmOldPassword();
            if (confirm > 0) {
                String updateRes = "";
                if (!newPass1.isBlank() && !newPass2.isBlank()) {
                    String updatePassRes = userController.updatePassword(user, newPass1) ? "Cập nhật mật khẩu thành công. Mật khẩu mới sẽ có hiệu lực từ phiên làm việc sau.\n" : "Cập nhật password thất bại!\n";
                    updateRes += updatePassRes;
                }
                if (userController.isDuplicatePhone(this.user.getId(), newPhone)) {
                    String updatePhoneRes = userController.updatePhone(user, newPhone) ? "Cập nhật số điện thoại thành công\n" : "Cập nhật số điện thoại thất bại!\n";
                    updateRes += updatePhoneRes;
                }
                if (updateRes.length() != 0) {
                    JOptionPane.showMessageDialog(null, updateRes, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (confirm < 0) {
                JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, error, "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        }
        loadUserList();
    }//GEN-LAST:event_btnUpdateCurUserActionPerformed

    private void tbnUserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnUserListMouseClicked
        // TODO add your handling code here:
//        selectedUser
        int row = tbnUserList.getSelectedRow();
        String selectedName = userListTableModel.getValueAt(row, 0).toString();
        if (!allUserList.isEmpty()) {
            selectedUser = allUserList.stream().filter(u -> u.getUsername().equals(selectedName)).findFirst().orElse(null);
            System.out.println(selectedUser.getId());
        }
    }//GEN-LAST:event_tbnUserListMouseClicked

    private void btnResetPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPassActionPerformed
        // TODO add your handling code here:
        if (user.getAuthority() != 1) {
            JOptionPane.showMessageDialog(null, "Tài khoản của bạn không có quyền thực hiện chức năng này.", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        } else {
            if (selectedUser != null) {
                if (selectedUser.getId() == 1) {
                    JOptionPane.showMessageDialog(null, "Bạn không thể đặt lại mật khẩu của tài khoản này", "Lỗi", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (userController.updatePassword(selectedUser, "abc123")) {
                        JOptionPane.showMessageDialog(null, "Mật khẩu đã được đặt lại \"abc123\".");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnResetPassActionPerformed

    private void btnLockAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLockAccountActionPerformed
        // TODO add your handling code here:
        int sltRowTblAccount = tbnUserList.getSelectedRow();
        if (user.getAuthority() != 1) {
            JOptionPane.showMessageDialog(null, "Tài khoản của bạn không có quyền thực hiện chức năng này.", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        } else {
            if (sltRowTblAccount == -1) {
                JOptionPane.showMessageDialog(null, "Bạn cần chọn một tài khoản để khóa.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            } else {
                if (selectedUser != null) {
                    if (selectedUser.getId() == 1) {
                        JOptionPane.showMessageDialog(null, "Bạn không thể khóa tài khoản này", "Lỗi", JOptionPane.WARNING_MESSAGE);
                    } else if (selectedUser.getStatus() == 1) {
                        int ans = JOptionPane.showConfirmDialog(null,
                                "Bạn có muốn khóa tài khoản ''" + user.getUsername() + "'' không?",
                                "Exit",
                                JOptionPane.YES_NO_OPTION
                        );
                        if (ans == 0) {
                            userController.updateStatus(selectedUser.getId(), 0);
                        }
                    }
                }
            }
        }
        loadUserList();
    }//GEN-LAST:event_btnLockAccountActionPerformed

    private void btnUnlockAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnlockAccountActionPerformed
        // TODO add your handling code here:
        if (user.getAuthority() != 1) {
            JOptionPane.showMessageDialog(null, "Tài khoản của bạn không có quyền thực hiện chức năng này.", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        } else {
            if (selectedUser != null) {
                if (selectedUser.getStatus() == 0) {
                    userController.updateStatus(selectedUser.getId(), 1);
                }
            }
        }
        loadUserList();
    }//GEN-LAST:event_btnUnlockAccountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccountManageView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountManageView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountManageView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountManageView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountManageView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLockAccount;
    private javax.swing.JButton btnNewAccount;
    private javax.swing.JButton btnResetPass;
    private javax.swing.JButton btnUnlockAccount;
    private javax.swing.JButton btnUpdateCurUser;
    private javax.swing.JComboBox<String> comboAuth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbnUserList;
    private javax.swing.JTextField txtCurPhone;
    private javax.swing.JTextField txtCurUserName;
    private javax.swing.JPasswordField txtNewPass1;
    private javax.swing.JPasswordField txtNewPass2;
    private javax.swing.JTextField txtNewUserName;
    private javax.swing.JPasswordField txtNewUserPass1;
    private javax.swing.JPasswordField txtNewUserPass2;
    private javax.swing.JTextField txtNewUserPhone;
    // End of variables declaration//GEN-END:variables
}