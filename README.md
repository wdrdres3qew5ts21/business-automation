# business-automation

Business Automation คือ Tools ใช้ในการออกแบบเงื่อนไขของ Business ที่มีการปรับเปลี่ยนกฏอยู่บ่อยๆตลอดเวลา ซึ่งการที่เรานำ Business Rule มาใช้จะช่วยให้ Source Code หลักจริงๆของเรานั้นไม่ต้องคำนึงถึงเรื่องเงื่อนไขที่เปลี่ยนบ่อยๆตลอดเวลานั่นเอง

employee.getFirstName().toLowerCase().substring(0.1).concat(employee.getLastName().toLowerCase())

### Deploy System
Business Rule สามารถ Deploy ได้ใน Cloud Native Environment อย่าง Kubernetes บน Red Hat Openshift Platform ได้อีกด้วยผ่านการใช้ Operator Framework 

1. ติดตั้ง Business-Automation จาก Openshift Catalog หรือติดตั้งเองได้ผ่าน Operator Hub
2. ใช้คำสั่ง `oc apply -f jbpm.yaml` เพื่อสร้าง Application
3. ใช้คำสั่ง `oc apply -f operator-configmap-route.yaml` และทำการลบ Openshift Route ของเดิมออกทั้งหมด Operator จะนำ Route ที่ผ่านการตั้งค่าถูกต้องกลับมาอีกครั้ง