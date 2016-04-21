drop table xjl_refactor_flow;
create table xjl_refactor_flow(id varchar2(36), name varchar2(50));

drop table xjl_refactor_material;
create table xjl_refactor_material(material_id varchar2(36), material_name varchar2(100),sample_picUrl varchar2(100));

drop table xjl_refactor_flow_material;
create table xjl_refactor_flow_material(flow_id varchar2(36), material_id varchar2(36));