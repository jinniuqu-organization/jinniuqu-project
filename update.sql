UPDATE dataserv_personal_label a set own_street=(
SELECT
case when b.present_address like '%西安路街道%'  then '西安路街道'
 when b.present_address like '%西华街道%'  then '西华街道'
 when b.present_address like '%荷花池街道%'  then '荷花池街道'
 when b.present_address like '%驷马桥街道%'  then '驷马桥街道'
 when b.present_address like '%茶店子街道%'  then '茶店子街道'
 when b.present_address like '%抚琴街道%'  then '抚琴街道'
 when b.present_address like '%九里堤街道%'  then '九里堤街道'
 when b.present_address like '%五块石街道%'  then '五块石街道'
 when b.present_address like '%营门口街道%'  then '营门口街道'
 when b.present_address like '%金泉街道%'  then '金泉街道'
 when b.present_address like '%沙河源街道%'  then '沙河源街道'
 when b.present_address like '%天回镇街道%'  then '天回镇街道'
 when b.present_address like '%凤凰山街道%'  then '凤凰山街道'
else '其他'
end as strtt
from dataserv_personal_label b where a.id=b.id
)

#多行转一行
UPDATE test a set nameother =(select string_agg ( b.name, ',' )
from test b where a.rank=b.rank and a.id!=b.id);