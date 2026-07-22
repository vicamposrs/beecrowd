SELECT pdt.name, pvd.name
FROM products AS pdt
INNER JOIN providers AS pvd
ON pdt.id_providers = pvd.id
WHERE pdt.id_categories = 6;